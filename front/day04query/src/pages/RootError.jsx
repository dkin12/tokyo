import React from 'react';
import {useRouteError} from "react-router";

function RootError(props) {
    const err = useRouteError();
    return (
        <div>
        <h2>Root 오류</h2>
        <p style = {{
            color: 'red'}}>
            {err?.statusText || err?.message}</p>
        </div>
    );

}

export default RootError;