import {useState} from 'react';

function StateEx1 () {
    const [txt,setTxt] = useState('');
    const [msg,setMsg] = useState('');
    const [userId, setUserId] = useState('');
    const [userPwd, setUserPwd] = useState('');
    const [show, setShow] = useState(true);

    return (
        <section className='boarderBottom'>
            <h2>onChange, onClick 이벤트</h2>
            <ul>
                <li>onChane 이벤트 핸들러 : input요소에 사용</li>
                <li>event 객체 : 이벤트 핸들러 함수의 파라미터(매개변수)로 전달되는 객체 ,e,event , evt </li>
                <li>e.target : 이벤트가 발생한 그 html 요소</li>
                <li>e.preventDefault() : 요소의 기본 성격 제거 (a,form 등 )</li>
                <li>e.stopPropagation(); : 이벤트 버블링 제거 </li>
            </ul>
            <div>
                <input type="text" value = {txt} placeholder='이곳에 작성하세요.'
                onChange={(e) => setTxt(e.target.value)} />
                <p>입력한 내용 : {txt} </p>
                {/* 게시판이런거를 만들때 사용할 것 */}
                <button onClick={()=>setTxt("")}>초기화</button>

            </div>

            {/*버튼 클릭 시 버튼에 담긴 메시가 h3요소 안에 출력*/}
            <div>
                <h3>{msg}</h3>
            <button onClick={()=>setMsg("즐거운 금요일!")}> 버튼 클릭 </button>
            </div>
            <div>
                <input type ="text" placeholder={"아이디를 입력하세요."} value = {userId}
                onChange={(e) => setUserId(e.target.value)} />
                <input type ="password" placeholder={"비밀번호를 입력하세요."} value = {userPwd} onChange={(e) => setUserPwd(e.target.value)} />
                <p>
                    아이디 : {userId} / 비밀번호 : {userPwd}
                </p>

            </div>
            <hr/>

            {/*버튼을 클릭하면 현재값 부정*/}
            <button onClick={() => setShow(!show)}>{show ? "숨기기" : "보이기"}</button>
            {/*참이면 <div> 내용이 보임*/}
            {show&&<div>내용이 보임</div>}
        </section>
    );
};

export default StateEx1;