import React from 'react';

function AgreeItem({ text, agree, onCheck }) {
    return (
        <label style={{ display: 'block' }}>
            <input
                type="checkbox"
                checked={agree}
                onChange={(evt) => onCheck(evt.target.checked)}
            />
            {text}
        </label>
    );
}

export default AgreeItem;
