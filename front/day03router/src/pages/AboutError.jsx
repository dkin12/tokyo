import React from 'react';
import {useRouteError} from "react-router";


// 소개 전용 오류 페이지
function AboutError(props) {
    // 오류 정보를 읽어옴
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

export default AboutError;