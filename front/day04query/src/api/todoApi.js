// api/todoApi.js

import { api } from "./api";

// 전체 목록 조회
/*
async function fetchTodos() {
    const res = await fetch("http://localhost:8080/todos");
    if (!res.ok) throw new Error("할 일을 불러오지 못함");
    return res.json();ㅁ
}
*/
/*
axios
자동 오류 검증 -> throw 자동으로 넘김
JSON 변환 자동
method, headers 등 설정도 자동

응답 데이터는 data로 리턴(항상)
*/


export async function fetchTodos() {
    const res = await api.get(`/todos`);
    console.log(res.data);
    return res.data;
}

// 추가
// 또 주석이라니
// async function createTodo(content) {
//     // post 방식으로 등록함
//     const res = await axios.get("http://localhost:8081/todos",{
//         method: "POST",
//         headers: {"Content-Type": "application/json"},
//         body: JSON.stringify({content})
//     });
//     if(res.status === 200){
//         return res.json;
//     }
// }
export async function createTodo(content) {
    const res = await api.post(`/todos`, { content });
    return res.data;
}
// 완료 토글
export async function toggleTodo({ id, isCompleted }) {
    const res = await api.patch(`/todos/${id}/done`, { isCompleted });
    return res.data; // 서버에서 수정된 todoDto 반환
}

// 삭제 토글
export async function deleteTodo(id) {
    const res = await api.delete(`/todos/${id}`);
    return res.data !== undefined && res.data !== null ? res.data : true; // 돌려받는 것이 없음
}

// 전체 수정
export async function updateTodo({ id, content, isCompleted, imageUrl }) {
    const res = await api.put(`/todos/${id}`, {
        id,
        content,
        isCompleted,
        imageUrl
    });
    return res.data;
}