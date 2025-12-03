import { NavLink, Outlet } from "react-router";

function ProductsLayout() {
    const onStyle = {color : '#fff',backgroundColor: '#333',padding : '2px 10px',
        textDecoration : 'none', fontWeight : 'bold'};
    const deStyle = {color : '#fff',textDecoration : 'none'};

    const linkStyle = ({isActive}) => isActive ? onStyle : deStyle;
    return (
        <div>
            <h2>제품</h2>
            <nav>
                <NavLink to="list" style={linkStyle}>Product List</NavLink> |
                <NavLink to="input"  style={linkStyle}>Product input</NavLink> |
                <NavLink to="info"  style={linkStyle}>Product info</NavLink>
            </nav>

            <hr />
            <Outlet />
        </div>
    );
}

export default ProductsLayout;


