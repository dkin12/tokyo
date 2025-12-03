import React from 'react';
import { Container } from "@mui/material";

function Home() {
    return (
        <Container>
            <h2>💀Home🔫</h2>
            <p>데이터 패치, 캐싱, 재요청 관리를 자동으로 하는 라이브러리</p>

            <ul>
                <li>데이터 캐싱</li>
                <li>자동 재요청</li>
                <li>로딩/에러 상태 제공</li>
                <li>mutation(POST/PUT/PATCH/DELETE) 캐시 갱신</li>

            </ul>

            <ul>
                <li>useQuery : 조회 .get</li>
                <li>useMutation : 수정 /등록 / 삭제 . POST/PUT/PATCH/DELETE</li>
                <li>useQueryClient : 캐시를 직접 조작할 때 사용 . invalidateQueries()로 다시 불러오기</li>
            </ul>
        </Container>
    );
}

export default Home;