import React from 'react';

// rsc : 리터럴 형식의 컴포넌트

const borderTop = {
    // 자바스크립트 객체
    // "키" :"값",
    // key : "value",
    // keys(name:name)
    borderTop: '2px solid lightgreen',
    padding : '16px',
    margin : '16px 0',

}

const BasicEx1 = () => {
    const user = '한라봉';
    return (
        <section style={borderTop}>
            <h2>JSX에서 지역 변수로 출력 </h2>
            <p>안녕하세여, {user}님</p>

        </section>
    );
};

export default BasicEx1;