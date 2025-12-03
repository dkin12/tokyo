import React, { useState } from 'react';
import { v4 as uuid } from 'uuid'; // 1. uuid 임포트

function Todos(props) {
    const [text, setText] = useState("");
    const [list, setList] = useState([]);
    const [editId, setEditId] = useState((null));

    const add = () => {
        const name = text.trim();
        if(!name) return; // 빈 값은 추가하지 않음

        // [참고] 'name' 변수를 사용했으므로 { id: uuid(), name: name }으로 수정
        setList(prev => [...prev, { id: uuid(), name: name }]);
        setText("");
    };

    // 삭제
    const remove = (id) => {
        setList((prevState) => prevState.filter((item) => item.id !== id));
    }
    // 수정
    const startEdit = (id,name) => {
        setEditId(id); // 어떤 리스트 수정할지 저장
        setText(name); // 기존 입력창에 수정 내용 업데이트
    }

    const saveEdit = (id) => {
        setList(prev => prev.map(item => item.id === editId ? {...item, name:text}:item));
        setEditId(null);
        setText("");
    }

    return (
        <div style={{ margin: 10 }}>
            <h2>Todo 리스트</h2>

            <input type="text"
                   placeholder='할 일 입력'
                   value={text}
                   onChange={(evt) => setText(evt.target.value)}
                   // onKeyDown={(evt) => {
                   //     if (evt.key === 'Enter' && !evt.nativeEvent.isComposing) add()
                   // }}
            />


            <hr />
            {
                editId == null ? <button onClick = {add}>추가</button> : <button onClick={saveEdit}>수정완료</button>
            }
            <ul>
                {list.map(item => (
                    /* [수정 1] style을 <li> 태그의 속성(prop)으로 이동
                    */
                    <li key={item.id} style={{margin : '10px 0'}}>

                        {item.name}
                        <button onClick={() => startEdit(item.id,item.name)}>수정</button>
                        <button onClick={() => remove(item.id)} style={{marginLeft: 10}}>삭제</button>
                    </li>
                ))}
            </ul>
        </div>
    );
}

export default Todos;