import { createBrowserRouter, RouterProvider } from "react-router";
import ProductHome from "./pages/ProductHome.jsx"
import RootLayout from "./layouts/RootLayout.jsx"
import './App.css'




const router = createBrowserRouter([
    {
        path: "/",
        element: <RootLayout />,
        children: [
            {
                index: true,
                element: <ProductHome />
            }
        ]
    },
])



function App() {
    return (
        <RouterProvider router={router} />
    );
}

export default App;