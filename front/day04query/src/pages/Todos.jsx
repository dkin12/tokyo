import { useMutation, useQuery, useQueryClient } from "@tanstack/react-query";
import { useState } from "react";
import {
    fetchTodos,
    createTodo,
    toggleTodo, deleteTodo, updateTodo,
} from "../api/todoApi.js"
import TodoItem from "../components/TodoItem.jsx";
import { Container, Paper, Typography, Box, TextField, Stack, Button, CircularProgress, List, Alert } from "@mui/material";





function Todos() {
    // 캐시 무효화 , 데이터를 다시 받아올 때
    const queryClient = useQueryClient();
    // 할 일 입력
    const [input, setInput] = useState("");



    /*
    useQuery의 기본 속성들: isPending, isError, data, error, status ...
    */

    const { // 구조 분해
        data: todos = [], // 서버에서 가져온 데이터
        isLoading, // 처음 요청 시. 반환값 true/false
        isError, // true/false
        error // 오류 객체(정보)
    } = useQuery({
        queryKey: ['todos'], // 캐시 구분용 고유 키(이름). 캐시에 저장된 데이터 다시 사용 시
        queryFn: fetchTodos // 실제 서버에서 데이터를 가져오는 함수
    });

    // 추가
    /*
        useMutation()
        .mutate()
        1. mutationFn 호출 -> 전달값을 담아 실제 서버 호출 역할
        2. 요청 성공 onSuccess : 콜백함수 실행 / isSuccess: true, false
        3. 요청 실패 onError : 콜백 실행 ( 설정한 경우 ) / isError : true, false
        4. 비동기 요청 동안 상태 관리 isPending : 요청 중이면 true
    */

    const refetch = () => {
        queryClient.invalidateQueries({ queryKey: ['todos'] });
    };


    const addMutation = useMutation({
        mutationFn: createTodo,
        onSuccess: refetch
    });

    //삭제 Mutation
    const deleteMutation = useMutation({
        mutationFn: deleteTodo,
        onSuccess: refetch
    });
    // 수정 Mutation
    const updateMutation = useMutation({
        mutationFn: updateTodo,
        onSuccess: refetch
    })

    // 이벤트 ======
    // 추가
    const handleAddList = (evt) => {
        evt.preventDefault(); // 페이지 새로고침 x
        // 업테이트 함수
        // 전달해주는 함수
        addMutation.mutate(input);
        setInput("");

    }

    // 삭제
    const onDelete = (id) => {
        deleteMutation.mutate(id)
    }


    // [수정] 4. 수정 핸들러
    const onUpdate = (id, content) => {
        // 1. 현재 수정하려는 할 일(todo)의 기존 정보를 찾습니다.
        const target = todos.find(todo => todo.id === id);

        if (!target) return; // 데이터가 없으면 중단

        // 2. 내용(content)은 바뀐 걸 넣고, 
        //    완료여부(isCompleted)와 이미지(imageUrl)는 기존 값을 그대로 유지해서 보냅니다.
        updateMutation.mutate({
            id,
            content,
            isCompleted: target.isCompleted,
            imageUrl: target.imageUrl
        });
    }



    // 완료 토글
    const toggleMutation = useMutation({
        mutationFn: toggleTodo,
        onSuccess: refetch
    })

    //


    // 완료 토글
    const onToggleDone = (id) => {
        const target = todos.find(todo => todo.id === id);
        if (!target) return;

        const flag = target.isCompleted === "Y" ? "N" : "Y";

        toggleMutation.mutate({
            id: target.id,
            isCompleted: flag
        })
    }



    // if (isLoading) return <p>데이터 로딩 중...</p>
    //if (isError) return <p style={{ color: "#f00" }}>오류 발생:{error?.message}</p>




    return (
        <Container maxWidth="sm" sx={{ mt: 4 }}>
            <Paper elevation={1} sx={{ p: 4 }}>
                <Typography gutterBottom variant="h6">🍅Todos🍅</Typography>
                <Box component="form" onSubmit={handleAddList}>

                    {/* 오류 표시 */}
                    {
                        isError && (
                            <Alert severity="error">
                                오류 : {error?.message}
                            </Alert>
                        )
                    }


                    {/* 가로 세로 정렬시 사용 */}
                    <Stack spacing={1} direction="row" sx={{ mt: 3 }}>
                        <TextField fullWidth label="할 일 입력" size="small"
                            value={input}
                            onChange={(evt) => setInput(evt.target.value)}
                        />
                        {/* outline, contained */}
                        <Button type="submit" disabled={addMutation.isPending} variant="contained">{
                            addMutation.isPending ? "추가중..." : "추가"
                        }</Button>
                    </Stack>
                </Box>

                <hr />
                {/* 로딩 상태 */}
                {isLoading ? (
                    <Box sx={{ display: 'flex', justifyContent: 'center' }}>
                        <CircularProgress />
                    </Box>
                ) : (

                    <List>

                        {
                            todos.map((todo) => (
                                <TodoItem key={todo.id} todo={todo}
                                    onToggleDone={onToggleDone}
                                    onDelete={onDelete}
                                    onUpdate={onUpdate}
                                    isTogglePending={toggleMutation.isPending}
                                    isDeletePending={deleteMutation.isPending}
                                    isUpdatePending={updateMutation.isPending}
                                />
                            ))
                        }




                    </List>
                )}

            </Paper>
        </Container >
    );
}

export default Todos;