import React from 'react';
import { useRouteError } from "react-router";

function TodosError() {
    const err = useRouteError();
    return (
        <div>
            <h2>todo 에러</h2>
            <p style={{
                color: 'red'
            }}>
                {err?.statusText || err?.message}</p>
        </div>
    );
}

export default TodosError;