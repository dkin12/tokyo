import React from 'react';

function ColorPicker({text, color}) {
    return (
        <div style={{
            backgroundColor: color,
            padding: 16,
            borderRadius: 10,
            margin: 10,
        }}>
            <p>{text}</p>
            <p>{color}</p>
        </div>
    );
}

export default ColorPicker;