# Spring Board


- 게시글 
- 댓글
- 회원가입 / 로그인
----- 
### 공통 
base URL :  /api



### 게시글 
- 목록 조회   GET     api/posts 
- 상세 조회   GET     api/posts/{id} 
- 글 작성    POST    api/posts           인증 필요
- 글 수정    PUT     api/posts/{id}  작성자만 
- 글 삭제    DELETE  api/posts/{id}  작성자만 
- 이미지     POST    /api/files/images   이미지 url 만 반환

### 댓글 
- 댓글 목록   GET     api/posts/{postid}/comments
- 댓글 작성   POST    api/posts/{postid}/comments   인증 필요
- 댓글 수정   PUT     api/comments/{/commentsid}  작성자만
- 댓글 삭제   DELETE  api/comments/{/commentsid}  작성자만


### 회원가입 / 로그인

- 회원가입    POST    /api/members 
- 로그인     POST    /api/auth/login 
- 내정보     GET     /api/members/myinfo