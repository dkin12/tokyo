import React from 'react';
import {useRouteError} from "react-router";

function Error(props) {
    const error = useRouteError();
    return (
        <div>
            <h3>오류 발생!!!</h3>
            <h3>오류 발생!!!</h3>
            <h3>오류 발생!!!</h3>
            <h3>오류 발생!!!</h3>
            <h3>오류 발생!!!</h3>
            <h3>오류 발생!!!</h3>
            <h3>오류 발생!!!</h3>
            <p>{error ?.message  || "알 수 없는 오류"}</p>
        </div>
    );
}

export default Error;

