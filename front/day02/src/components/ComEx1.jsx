import React,{useState} from 'react';
import AgreeItem from './child/AgreeItems.jsx';

function ComEx1() {

    const [agree1, setAgree1] = useState(false);
    const [agree2, setAgree2] = useState(false);
    const [agree3, setAgree3] = useState(false);
    const ok = agree1 && agree2 && agree3; // 나중에 모두 동의 체크 여부로 변경
    return (
        <section className='borderTop'>
            <h2>체크박스 2개로 모두 동의 제어</h2>
            <p>1,2 모두 체크가 되면 다음 버튼 활성화</p>
            <hr />
            {/*{리액트의 부모 -> 자식 props만 가능 하나
                함수를 내려보내 값을 부보가 받는 형태는 가능
            }
            */}
            <AgreeItem text="약관 1동의" agree={agree1} onCheck={setAgree1}/>
            <AgreeItem text="약관 2동의" agree={agree2} onCheck={setAgree2}/>
            <AgreeItem text="약관 3동의" agree={agree3} onCheck={setAgree3}/>
            <br />
            <button disabled={!ok}>다음</button>
        </section>
    );
}

export default ComEx1;