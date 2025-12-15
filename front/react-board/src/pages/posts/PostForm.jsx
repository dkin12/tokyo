import { useState } from 'react';
import { Box, Paper, Stack, Typography } from '@mui/material'
import PostFormFields from '../../components/posts/PostFormFields';
import PostFormImage from '../../components/posts/PostFormImage';
import PostFormSubmit from '../../components/posts/PostFormSubmit';
import { useMutation, useQueryClient } from '@tanstack/react-query';
import { createPosts } from '../../api/postsApi';
import { useNavigate, useParams } from 'react-router';
import { useQuery } from '@tanstack/react-query';
import Loader from '../../components/common/Loader';
import { fetchPostsDetail } from '../../api/postsApi';
import { updatePosts } from '../../api/postsApi';
import ErrorMessage from '../../components/common/ErrorMessage';

// mode:create -> 새 글 작성 / mode:edit -> 수정
function PostForm({ mode }) {
    const isEdit = mode === 'edit'; // true 수정, false 새 글 작성
    const queryClient = useQueryClient // Query 캐시 무효화
    const navigate = useNavigate(); // 다른 페이지로 이동
    const { id } = useParams(); // url에서 :id(동적 파라미터) 읽음
    const postId = Number(id); // 파라미터는 기본적으로 문자열이기 때문에 숫자로 변경

    // 폼 입력 값
    const [title, setTitle] = useState("");
    const [content, setContent] = useState("");

    // 이미지
    const [imageName, setImageName] = useState("");

    // TanStack Query =================
    // 생성
    const createMutation = useMutation({
        mutationFn: createPosts,// Api 함수
        onSuccess: () => {
            queryClient.invalidatequeries({ queryKey: ['posts'] })
            navigate(`/posts/${create.id}`); // 글 작성 성공시 글 목록 페이지로 이동
        },
        onError: (error) => {
            alert(`게시글 작성 실패: ${error.message}`);
        }
    });


    // 수정일 때 기존 데이터 조회
    const { data: post, isLoading, isError } = useQuery({
        queryKey: ['post', postId],
        queryFn: () => fetchPostsDetail(postId),
        enabled: isEdit, // 수정 모드일 때만 실행
    })

    // 수정
    const updateMutation = useMutation({
        mutationFn: (payload) => updatePosts(postId, payload), // Api 함수
        onSuccess: (update) => {
            queryClient.invalidateQueries({ queryKey: ['posts'] });
            // 상세페이지 캐시 무효화
            queryClient.invalidateQueries({ queryKey: ['post', postId] });
            navigate(`/posts/${update.id}`); // 글 수정 성공시 해당 글 상세 페이지로 이동
        },
        onError: (error) => {
            alert(`게시글 수정 실패: ${error.message}`);
        }
    });

    // 이벤트 핸들러 ================
    // 폼 전송 **
    const handleSubmit = (evt) => {
        evt.preventDefault();

        const payload = {
            title: title.trim(),
            content: content.trim(),
            imageName: null,
        };
        if (!title.trim() || !content.trim()) {
            alert('제목과 내용을 입력해주세요.');
            return;
        }
        if (isEdit) {
            // 수정
            updateMutation.mutate(payload);
        } else {
            // 생성
            createMutation.mutate(payload);
        }
    }

    if (isEdit && isLoading) {
        return <Loader />
    }
    if (isEdit && isError) {
        return <ErrorMessage message='게시글을 불러오는 데 실패했습니다.' />;
    }

    // 수정 모드일 때 기존 데이터로 초기화
    if (isEdit && post) {
        if (title === "") setTitle(post.title);
        if (content === "") setContent(post.content);
    }


    return (
        <Box sx={{ px: 3, py: 6 }}>
            <Paper
                sx={{
                    width: '100%',
                    borderRadius: 3,
                    p: 4,
                    boxShadow: '0 16px 45px rgba(0,0,0,0.06)'
                }}>
                {/* 제목 */}
                <Typography variant='h6' sx={{ fontWeight: 700, mb: 3 }}>
                    {isEdit ? '게시글 수정' : '새 글 작성'}
                </Typography>

                <Box component='form' onSubmit={handleSubmit}>
                    <Stack spacing={2.5}>
                        {/* 입력 필드 */}
                        <PostFormFields
                            title={title}
                            content={content}
                            onChangeTitle={setTitle}
                            onChangeContent={setContent}
                        />

                        {/* 이미지 업로드 */}
                        <PostFormImage />


                        {/* 등록, 수정 버튼 */}
                        <PostFormSubmit isEdit={isEdit} />
                    </Stack>
                </Box>
            </Paper>
        </Box>
    );
}

export default PostForm;