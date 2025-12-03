import React from 'react';

const users = [
    {id:1,name:"한라봉",age:2},
    {id:2,name:"진지향",age:3},
    {id:3,name:"천혜향",age:1},
    {id:4,name:"타이백",age:5},
];

const data = [
    {no : 10, name : '사과',price : 1500},
    {no : 20, name : '귤',price : 1000},
    {no : 30, name : '단감',price : 2000},
    {no : 40, name : '망고',price : 3000},
]

function ListEx1(props) {
    const lists = ['사과','바나나','망고','포도','귤','단감'];
    const nav = ['home','about','intro'];


    return (

            <section className="boarderBottom">
                <h2>구조 분해 할당 </h2>
                <ul>
                    {/*const {no,name,price} = data*/}
                    {
                        data.map(({no,name,price})=>(
                            <li key={no}>{name}의 가격은 {price.toLocaleString()}입니다.</li>
                        ))
                    }
                </ul>


                <h2>객체 리스트 렌더링</h2>
                <hr/>
                <ol>
                { users.map((user, index) => (
                    <li key={index}>{user.name}</li>
                ))}
                </ol>
                <ol>
                    {
                        users.map((user, index) => (
                            <li key = {user.id}>이름 : {user.name} / 나이 : {user.age} </li>
                        ))
                    }
                </ol>

                <ol>
                    {
                        data.map((item, index) => (
                            <li key = {index}>{item.name}는 {item.price}원 입니다.</li>
                        ))
                    }
                </ol>
                <h2>리스트 안에 버튼 넣기</h2>
                <ul>
                    {   nav.map((menu,idx) =>(
                            <li key={idx}><button>{menu}</button></li>
                        ))
                    }
                </ul>
                <h2>기본 리스트 렌더링</h2>

                <ol>

                    {/*{배열.map(요소[,인덱스]) => ())}*/
                        lists.map((item, index) => (
                            <li key={index}>{item}</li>
                        ))
                    }

                </ol>
            </section>
            /*
        <StateEx3/>
        <StateEx2/>
        <StateEx1/>

        */

    );
}

export default ListEx1;