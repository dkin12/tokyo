import React from 'react';

function BasicEx2() {
    const imgUrl = 'https://placehold.co/300/green/fff?text=img?';
    const title = '임시 이미지';
    let desc = "test";
    const a = 3, b = 5;

    return (
        <>
        <h2>JSX 속성 바인딩</h2>
        <img src={imgUrl} alt = {desc}/>
            <p>{a} + {b} = {a+b}</p>
        </>
    );
}

export default BasicEx2;