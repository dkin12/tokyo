import React, {useState} from 'react';
import StateEx3Child from "./StateEx3Child.jsx";

function StateEx1 () {
    let [count, setCount] = React.useState(0);
    let [mode, setMode] = React.useState(true);
    const [checkMode, setCheckMode] = useState('일반');

    const plus = () => {
        //setCount(count + 1);
        // 관용적으로 prev, prevState를 사용함
        setCount((prev) => prev + 1);

        // 이전 값을 기반으로 업데이트
    }
    const minus = ()=> {
        setCount((prev) => prev - 1);
    }
    const admin = () => {
        setCheckMode('관리자');
    }

    return (
        <section className='boarderBottom'>
            <h2>state 연습</h2>
            <ol>
                <li>StateEx3Child 컴포넌트 생성해서 props로 name을 넘겨 받아 안녕, name 출력</li>
                <li>count " 1 증가 버튼 , 1 감소 버튼</li>
                <li>mode : 관리자 모드, 일반모드 버튼</li>
            </ol>
            <StateEx3Child name="망고" />

            <h3>지금 숫자 : {count}</h3>
            <button onClick={()=>setCount(++count)}>1증가 버튼</button>
            <button onClick={()=>setCount(--count)}>1감소 버튼</button>
            <p>카운트 : {count}</p>
            <button onClick={plus}>1증가</button>
            <button onClick={minus}>1감소</button>
            <button
                onClick={()=>setMode(!mode)}>{mode ? "관리자 모드" : "사용자 모드"}</button>

            <h3>현재 모드{checkMode} </h3>
            <button onClick={() => setCheckMode('일반')}>일반 모드</button>
            <button onClick={admin}>관리자</button>
        </section>

    )
};

export default StateEx1;