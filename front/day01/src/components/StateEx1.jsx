import {useState} from 'react';

function StateEx1 () {
    const [username,setUsername] = useState('한라봉');
    let [count,setCount] = useState(0);
    return (
        <section className='boarderBottom'>
            <h2>state 상태관리</h2>
            <ul>
                <li>함수형 컴포넌트에서 상태를 관리하는 훅(hook)</li>
                <li>JSX는 변경사항을 useState()로만 감지하고 렌더링함</li>
                <li>const[변수,변수를 바구는 함수] = userState(초기값);</li>
            </ul>
        <hr/>
            <div>
                <p>이름 : {username}</p>
                <button onClick={() => setUsername('감흥')}> 이름 바꾸기 </button>

            </div>
            <div>
                <p> 클릭 수 : {count}</p>
                <button onClick={() => setCount(++count)}>더하기 1</button>
            </div>
        </section>
    );
};

export default StateEx1;