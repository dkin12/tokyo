import {BrowserRouter, createBrowserRouter, Link, Route, RouterProvider, Routes} from "react-router"
import './App.css'
import Home from "./pages/Home";
import About from "./pages/About";
import NotFoundPage from "./pages/NotFoundPage.jsx";
import RootLayout from "./layouts/RootLayout.jsx";
import Products from "./pages/Products.jsx";
import AboutLayout from "./pages/AboutLayout.jsx";
import AboutCompany from "./pages/AboutCompany.jsx";
import AboutFamily from "./pages/AboutFamily.jsx";
import AboutError from "./pages/AboutError.jsx";
import Photos from "./pages/Photos.jsx";
import PhotosErrors from "./pages/PhotosErrors.jsx";


// data loader 설정
async function photoLoader(){
    // const res = await fetch("https://jsonplaceholder.org/phost");
    const res = await fetch("/api/posts");
    // 이 단계에서 오류가 발생하면 가장 가까운 errorElement 로 전달
    if(!res.ok)throw new Error('데이터 못 불러옴');
    const data = await res.json();
    console.log(data);
    return data; // useLoaderData()
}


// 라우터 트리
const router = createBrowserRouter([
   // {key:value, "key":"",key},
    {
        path: "/", // 최상위 경로
        element : <RootLayout/>, // 공통레이아웃

        children: [ // 자식 라우트 생성 .RootLayout의 Outline에서 교체되는 페이지
            {
                index : true, // path : "/"를 기본으로 설정
                element : <Home/>
            },
            {
                path : "about", // 슬래시로 시작하지 않음, 부모의 경로 / 뒤에 주소가 붙음
                element : <AboutLayout />,
                errorElement : <AboutError/>, // about관련 렌더링 오류시 보여지는 페이지
                children : [
                    {
                        index : true,
                        element : <About/>
                    },
                    {
                        path : "company",
                        element : <AboutCompany/>
                    },
                    {
                        path : "family",
                        element : <AboutFamily/>
                    },
                    // {
                    //     path : "*",
                    //     element : <AboutError/>
                    // }
                ]
            },
            {
                path : "/photos",
                loader : photoLoader,
                element : <Photos/>,
                errorElement : <PhotosErrors/>
            },
            {
                path : "pro",
                element : <Products/>
            },
            {
                path : "*",
                element : <NotFoundPage/>
            }

        ]
    }
]);
// rsf
function App(props) {

    // 라우트 트리

    return (
        <RouterProvider router = {router}/>
    );
}

export default App;
