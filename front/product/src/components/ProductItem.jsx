import React from 'react';
import { ListItem, Tooltip, IconButton } from "@mui/material";
import DeleteIcon from '@mui/icons-material/Delete'

function ProductItem({
    product,
    onDelete,
    isDeletePending,
}) {
    const { id, name, price } = product;

    // 삭제 핸들러
    const handleDelete = () => onDelete(id);

    return (
        <ListItem divider>
            <>
                {name} - {price}원
            </>
            {/* 삭제 버튼 */}
            <Tooltip title="삭제">
                <IconButton
                    edge="end"
                    onClick={handleDelete}
                    disabled={isDeletePending}
                >
                    <DeleteIcon />
                </IconButton>
            </Tooltip>
        </ListItem >
    );
}

export default ProductItem;