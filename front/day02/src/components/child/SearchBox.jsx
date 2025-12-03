import React, { useState } from 'react';

// 입력 담당 컴포넌트
function SearchBox({ value, onChange }) {
    const [query, setQuery] = useState("");
    return (
        // 텍스트 필드에 작성된 내용(value)을 부모 컴포넌트에 전달
        <input type="search"
               placeholder='검색어를 입력하세요'
               value={value}
               onChange={(evt) => onChange(evt.target.value)}
        />
    );
}

export default SearchBox;