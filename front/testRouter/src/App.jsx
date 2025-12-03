
// 라우터 트리
import './App.css'
import RootLayout from "./layouts/RootLayout.jsx";
import {createBrowserRouter, RouterProvider} from "react-router";
import Home from "./pages/Home.jsx";
import Users from "./pages/Users.jsx";
import Error from "./pages/Error.jsx";
import ProductInput from "./pages/ProductInput.jsx";
import ProductInfo from "./pages/ProductInfo.jsx";
import ProductList from "./pages/ProductList.jsx";
import ProductLayout from "./layouts/ProductLayout.jsx";
import NotFoundPage from "./pages/NotFoundPage.jsx";


async function UserLoader(){
    const res = await fetch("https://jsonplaceholder.typicode.com/users");
    if(!res.ok) throw new Error('데이터를 불러올 수 없음');
    const data = await res.json();
    console.log(data);
    return data;
}


const router = createBrowserRouter([
    // {key:value, "key":"",key},
    {
        path: "/", // 최상위 경로
        element : <RootLayout/>, // 공통레이아웃

        children: [ // 자식 라우트 생성 .RootLayout의 Outline에서 교체되는 페이지
            {
                index : true, // path : "/"를 기본으로 설정
                element : <Home/>,
            },
            {
                path: "users",
                element: <Users/>,
                loader : UserLoader,
            },
            {
                path : "products",
                element : <ProductLayout />,
                errorElement : <Error/>,
                children : [
                    {
                        index : true,
                        element : <ProductList/>
                    },
                    {
                        path : "list",
                        element : <ProductList/>
                    },
                    {
                        path : "input",
                        element : <ProductInput/>
                    },
                    {
                        path : "info",
                        element : <ProductInfo/>
                    },
                    { path : "*", element :<Error/> }
                ]
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
