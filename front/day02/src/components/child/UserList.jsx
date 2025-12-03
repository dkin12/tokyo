import React from 'react';

// 출력 컴포넌트
function UserList({ query, users }) {

    const list = users.filter((user) => (
        user.toLowerCase().includes(query.toLowerCase())
    ))


    return (
        <ul>
            {list.map((elem, idx) => <li key={idx}>{elem}</li>)}

        </ul>
    );
}

export default UserList;