import React from 'react';
import {Link, Outlet} from "react-router";

function AboutLayout(props) {
    return (
        <div>

            <nav>
                <Link to="/about">소개 첫 화면</Link> | {" "}
                    <Link to="/about/company">회사 소개</Link> | {" "}
                <Link to="/about/family">조직도</Link> | {" "}
            </nav>
            {/*{about의 하위 컴포넌트 페이지 출력 영역}*/}
            <Outlet/>
        </div>
    );
}

export default AboutLayout;