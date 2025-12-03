import React, { useState } from 'react';
import SearchBox from './child/SearchBox';
import UserList from './child/UserList';

function ComEx4() {
    const users = ['한라봉', '타이벡', '티니', '토방이', '감홍', '유라조생', '유라실생', '감자', '고구마', '한라산'];
    const [query, setQuery] = useState("");

    return (
        <section className='borderTop'>
            <h2>입력, 출력 컴포넌트 분리</h2>

            <SearchBox value={query} onChange={setQuery} />
            <UserList query={query} users={users} />
        </section>
    );
}

export default ComEx4;