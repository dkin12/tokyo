# 백엔드


entity:
Integer id;
String content
LocalDateTime regDate;
YnFlag isCompleted;
String imageUrl;

# JSON:
{
"id": 1 // 자동 입력
"content": 공부하기 // 필수 입력
"regDate": "2025-11-25 13:09:28", // 자동 입력
"isCompleted": "Y", // 선택 입력 n
"imageUrl": "banana.png" // 선택입력 null
}


## 기본 URL: /todos
GET         /todos              전체 조회 List<TodoDto>
POST        /todos              등록 { content, isCompleted, imageUrl }
PUT         /todos/{id}         전체 수정 todoDto
PATCH       /todos{id} /done    완료여부 { isCompleted }
DELETE      /todos{id}          삭제 .noContent() 204
