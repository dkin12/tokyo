import React, { useState } from 'react';
import TodoImage from "./TodoImage.jsx";
import dayjs from 'dayjs';
import { ListItem, Button, Tooltip, IconButton, Checkbox } from "@mui/material";
import DeleteIcon from '@mui/icons-material/Delete'

function TodoItem({
    todo,
    onToggleDone,
    onDelete,
    onUpdate,
    isTogglePending,
    isDeletePending,
    isUpdatePending
}) {

    const { id, content, regDate, isCompleted, imageUrl } = todo;

    const [isEdit, setIsEdit] = useState(false);
    const [editInput, setEditInput] = useState(content);

    // 이미지 경로 설정
    const apiBase = import.meta.env.VITE_API_BASE_URL;
    const imageSrc = imageUrl ? `${apiBase}${imageUrl}` : null;


    // 이벤트 핸들러 ============
    // 토글 체크
    const handleToggle = () => onToggleDone(id);

    // 삭제
    const handleDelete = () => onDelete(id);

    // 수정 시작
    const handleStartEdit = () => {
        setIsEdit(true);
        setEditInput(content); // 항상 최신 내용으로 초기화 // 구조분해해서 변수로 직접 받는 값
    }

    // 수정 저장
    const handleSave = () => {
        const text = editInput.trim();
        if (!text) return;

        onUpdate(id, text); // 부모 컴포넌트(서버 응답)로 결과값 리턴
        setIsEdit(false); // 상태 변수를 false로 변경해야함(수정 버튼)
    }

    // 취소
    const handleCancel = () => {
        setIsEdit(false);
        setEditInput(content); // 원래 내용으로 롤백
    }

    return (
        <ListItem divider>
            {/* 체크 상태 -> 부모 컴포넌트 */}
            <Checkbox
                edge="start"
                checked={isCompleted === "Y"}
                onChange={handleToggle}
                disabled={isTogglePending}
            />



            {/* 이미지 있으면 보여지고 없으면 안보임 */}
            {/* <TodoImage url={imageSrc} alt={`img${id}`} /> */}
            {imageSrc && <TodoImage url={imageSrc} alt={`img${id}`} />}

            {/*내용 = 수정/삭제 ( 수정 -> 완료 , 취소 버튼 추가  )*/}
            {
                isEdit ? (
                    <>
                        <input type="text"
                            value={editInput}
                            onChange={(evt) => setEditInput(evt.target.value)}
                        />
                        <Button disabled={isUpdatePending} onClick={handleSave}>
                            {isUpdatePending ? '저장 중...' : '저장'}

                        </Button>
                        <Button type='reset' onClick={handleCancel}>취소</Button>
                    </>
                ) : (
                    <>
                        <p style={{
                            display: 'inline-block',
                            color: isCompleted === "Y" ? "#999" : "#000",
                            textDecoration: isCompleted === "Y" ? "line-through" : "none"
                        }}>
                            {content} - {" "}
                            <span style={{ fontSize: 12, fontStyle: 'italic' }}>
                                {dayjs(regDate).format("YYYY.MM.DD HH:mm")}
                            </span>
                        </p>
                        <Button onClick={handleStartEdit}>수정</Button>
                    </>

                )
            }

            {/* 삭제 버튼 */}
            <Tooltip title="삭제">
                <IconButton
                    edge="end"
                    onClick={handleDelete} disabled={isDeletePending}
                >
                    <DeleteIcon />
                </IconButton>
            </Tooltip>

        </ListItem >
    );
}

export default TodoItem;