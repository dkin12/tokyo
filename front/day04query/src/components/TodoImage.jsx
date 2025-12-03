import React from 'react';

function TodoImage({ url, alt }) {
    const errorImg = (evt) => {
        //evt.target.src = "https://placehold.co/100/orange/fff?text=img";
        evt.target.style.display = "none";
    }



    return (
        <img src={url} alt={alt}
            onError={errorImg}
            style={{
                width: 40,
                height: 40,
                objectFit: "cover",
                marginRight: 10,
            }}

        />
    );
}

export default TodoImage;