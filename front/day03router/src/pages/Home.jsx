import React from 'react';

function Home(props) {
    return (
        <>
            <h1>React Router</h1>
            <p>페이지의 새로고침없이 필요한 컴포넌트만 변경</p>

            <ul>
                <li>Declarative : 단순 페이지 전환이 필요할 때</li>
                <li>Data : CRUD 등의 SPA에서 라우팅이 필요할 때</li>
                <li>Framework: SSR, 파일 라우팅 등이 필요할 때</li>
            </ul>

            <h2>주요 API</h2>
            <ul>
                <li>Route : 특정 경로와 컴포넌트를 연결</li>
                <li>Link : a와 같은 역할이나 새로고침 없음</li>
                <li>Outlet : 중첩 라우트에서 자식 컴포넌트(페이지)가 보여지는 영역</li>
                <li>useNavigate : 페이지 안에서 버튼 등으로 이동할 때 주로 사용</li>
                <li>createBrowserRouter : 라우트 트리 생성</li>
            </ul>
        </>
    );
}

export default Home;