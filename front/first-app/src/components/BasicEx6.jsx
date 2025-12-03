import React from 'react';

const BasicEx6 = (props) => {
    const fruits = ['한라봉','진지향','타이백','윈터프린스','유라조생','레드향','천혜향']
    return (
        <section>
            <h2> 리스트 렌더링</h2>
            <p>배열.map(콜백함수)</p>
            <p>유일한 key 값 필수</p>
            <p> key의 값으로 배열 인덱스는 되도록 사용하지 않음</p>
            <hr/>
            <ul>{
                fruits.map((fruits) => <li key={index}>{fruits}</li>)
            }</ul>
        </section>


    );
};

export default BasicEx6;