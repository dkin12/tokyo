
import './App.css'
import { createBrowserRouter, RouterProvider } from "react-router";
import Todos from "./pages/Todos.jsx";
import Home from "./pages/Home.jsx";
import RootLayout from "./layouts/RootLayout.jsx";
import RootError from "./pages/RootError.jsx";
import TodosError from "./pages/TodosError.jsx";
import NotFoundPage from "./pages/NotFoundPage.jsx";

// 라우터 트리 정의
/*
"/" <Home />
"/todos" <Todos/>
*/

const router = createBrowserRouter([
    {
        path: "/",
        element: <RootLayout />,
        errorElement: <RootError />,
        children: [
            {
                index: true,
                element: <Home />
            },
            {
                path: "todos",
                element: <Todos />,
                errorElement: <TodosError />
            },
            {
                path: "*",
                element: <NotFoundPage />
            }
        ]
    },
])

// provider 연결
function App() {
    return (
        <RouterProvider router={router} />
    );
}

export default App;