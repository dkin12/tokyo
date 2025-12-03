import React, { useState } from 'react';
import ColorPicker from './child/ColorPicker';

function ComEx2(props) {
    const [color, setColor] = useState("#eee")

    return (
        <section className='borderTop'>
            <h2>상태 공유</h2>
            <input type="color" value={color} onChange={(evt) => setColor(evt.target.value)} />
            <p>컬러코드 : {color}</p>
            <hr />
            <div style={{ display: 'flex', gap: 10 }}>
                <ColorPicker text = "box1" color ={color}/>
                <ColorPicker text = "box2" color ={color}/>/>
            </div>
        </section>
    );
}

export default ComEx2;