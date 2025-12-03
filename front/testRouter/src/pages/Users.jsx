import React from 'react';
import {useLoaderData} from "react-router";
function Users(props) {
    const users = useLoaderData();
    return (
        <ol>
            {users.slice(0, 5).map((user) => (
                <li key={user.id}>
                    {user.name} ({user.email}) - {user.address.city}
                </li>
            ))}
        </ol>

    );
}

export default Users;