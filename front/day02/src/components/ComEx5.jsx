import React, { useState } from 'react';
import Tag from './child/Tag';

function ComEx5() {
    const lists = ['한라봉', '또라봉', '진지향', '타이벡', '윈터프린스']
    const [selected, setSelected] = useState([]);
    const toggleTag = (elem) => {
        if (selected.includes(elem)) {
            setSelected(selected.filter(t => t !== elem));
        } else {
            setSelected([...selected, elem]);
        }
    }


    return (
        <section className='borderTop'>
            <h2>버튼 클릭시 스타일 토글</h2>
            {
                lists.map((elem, idx) => (
                    <Tag key={idx} btnName={elem}
                         active={selected.includes(elem)}
                         onToggle={() => { toggleTag(elem) }} />
                ))
            }
            <p>선택 : {selected.join(", ") || "없음"}</p>
        </section>
    );
}

export default ComEx5;