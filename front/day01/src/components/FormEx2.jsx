import React, {useState} from 'react';
function FormEx2() {
    const [agree, setAgree] = useState(false);
    const [role, setRole] = useState("");
    const [email, setEmail] = useState("");
    const transKo = {user:"사용자",admin:"관리자"};

    const handleSubmit = (e) => {
        // 요소의 기본 성격 제거 a,form
        e.preventDefault();
        alert(`이메일 : ${email}`);
        setEmail(""); // 전송 후 입력창 비우기
    }

    return (
      <section className="boarderBottom">
          <form onSubmit={handleSubmit}>
              <h2>form 태그로 submit 처리 </h2>
              <input type = "email" placeholder="이메일을 입력하세요."
              onChange={e => setEmail(e.target.value)}
              value={email}/>
              <button type= "submit">전송</button>
          </form>

          <h2>라디오 버튼</h2>
          {/*name의 값을 똑같이 줘야함;;*/}
          <input type="radio" name = "work" id = 'user' value = "user"
          onChange={evt => setRole(evt.target.value)}></input>
          <label htmlFor="user">사용자</label>
          <input type="radio" name = "work" id = 'admin' value = "admin"
                 onChange={evt => setRole(evt.target.value)}></input>
          <label htmlFor="user">관리자</label>

          <p>모드 : {transKo[role]}</p>

          <h2>체크 박스 상태</h2>
          <label>
              <input type="checkbox"
              onChange={(evt) => setAgree(evt.target.checked)}/>
              약관에 동의합니다.
              {/* selected쓰면됨 */}
              {/*{체크를 하면 동의 완료, 해제하면 동의 필요}*/}
              <p>{ agree ? "동의 완료" : "동의 필요"}</p>
          </label>
      </section>
    );
}
export default FormEx2;