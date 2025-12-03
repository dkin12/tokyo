import React from 'react';
import { useRouteError } from 'react-router';

function PhotosError(props) {

    const error = useRouteError();

    return (
        <div>
            <h3>앨범을 불러오는 중 오류 발생</h3>
            <p style={{ color: "f00", fontWeight: "bold" }}>
                {error?.statusText || error?.message}
            </p>
        </div>
    );
}

export default PhotosError;