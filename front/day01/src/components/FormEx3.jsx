import React from 'react';


const FormEx3 = () => {
    const [show, setShow] = React.useState(false);
    const [pw, setPwd] = React.useState('');
    return (
        <section className="boarderBottom">
            <h2>비밀번호 보기</h2>
            {/*<input type = "text" value={pw}*/}
            {/*onChange={e => setPwd(e.target.value)} />*/}
            {/*비밀번호를 비워두면 비밀번호 작성 필수 메시지 출력*/}
            {pw.trim() == "" && <p style={{color :"#f00"}}>비밀번호는 필수입니다.</p>}
            <input type={ show ? "text" : "password"} value={pw} onChange={e => setPwd(e.target.value)} />

            {/*참이면 숨기기가 버튼 명으로 나오고 거짓이면 보이게 하기 */}
            <button onClick={(e)=>setShow(!show)}>{ show ? "비밀번호 숨기기" : "비밀번호 보이기"}
            </button>
        </section>
    );
};

export default FormEx3;