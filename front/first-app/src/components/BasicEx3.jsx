import React from 'react';

function BasicEx3({menu}) {
    return (
        <>
            <section>
                <h2>props로 데이터 전달</h2>
                <ul>
                    <li>리액트의 데이터 전달 기본은 부모 -&gt; 자식으로의 흐름만 가능</li>
                    <li>자식 -&gt; 부모로의 데이터 잔달은 기본적으로 안됨 ( 함수를 통해 반환 받는 것은 가능 ) </li>
                    <li></li>
                </ul>
                <h3>오늘의 메뉴는{menu}</h3>
            </section>
            
            </>
    );
}

export default BasicEx3;