import React from 'react';

const BasicEx5 = () => {

    const isLogin = false;
    // 자바스크립트 객체
    // backgraoundColor : "orange", "tranparent"
    // fontSize : "1.5rem" , "1rem

    const byStyle = {
        backgroundColor: isLogin ? 'red' : 'green',
        fontStyle : isLogin ? "1.5rem" : "1rem"
    }
    return (
        <section className="borderTop">
            <h2>조건부 렌더링(&&,?:)</h2>
            <p>조건에 따라 로그인 메시지와 스타일 변경</p>
            <hr/>
            {/*{false&&<p>로그인되었습니다.</p>}*/}
            {isLogin&&<p style={byStyle}>로그인되었습니다.</p>}
            {/*{조건이 참이면 로그인되었습니다. 메시지 출력}*/
                isLogin ? "로그인되었습니다." : "로그인에 실패했습니다."
            }
            <p className={isLogin ? "" : "fontStyle"}>
                {isLogin ? "관리자 페이지로 이동합니다." : "아이디나 비밀번호를 입력하세요.!!"}

            </p>


        </section>
    );
};

export default BasicEx5;