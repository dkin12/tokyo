import React from 'react';

function BasicEx3({title,children}) {
    return (
        <>
            <section className='borderTop'>
                <h2>children으로 넣기</h2>
                <h3>{ title }</h3>
                { children }
            </section>
            
            </>
    );
}

export default BasicEx3;