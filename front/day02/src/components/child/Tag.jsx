import React from 'react';

function Tag({btnName,active,onToggle}) {
    return (
        <button
            onClick={onToggle}
            style={{
                margin : 6,
                border: active ? '1px solid ' : 'transparent'
            }}
        >{btnName}</button>
    );
}

export default Tag;