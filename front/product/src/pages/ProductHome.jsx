import { useMutation, useQuery, useQueryClient } from "@tanstack/react-query";
import { useState } from "react";
import { fetchProducts, createProduct, deleteProduct } from "../api/productApi";
import ProductItem from "../components/ProductItem";

function ProductHome() {
  const queryClient = useQueryClient();
  const [name, setName] = useState("");
  const [price, setPrice] = useState("");

  const {
    data: product = [],
    isLoading,
    isError,
    error
  } = useQuery({
    queryKey: ['products'],
    queryFn: fetchProducts
  });

  const products = Array.isArray(product) ? product : (product?.products || product?.data || []);

  const refetch = () => {
    queryClient.invalidateQueries({ queryKey: ['products'] });
  };

  const addMutation = useMutation({
    mutationFn: createProduct,
    onSuccess: refetch
  });

  const deleteMutation = useMutation({
    mutationFn: deleteProduct,
    onSuccess: refetch
  });

  const handleSubmit = () => {
    if (!name || !price) return;
    addMutation.mutate({ name, price: parseInt(price) })
  };

  const handleDelete = (id) => {
    deleteMutation.mutate(id);
  };

  if (isLoading) return <div>로딩 중...</div>;
  if (isError) return <div>에러 발생: {error.message}</div>;

  return (
    <div>
      <h1>상품 목록</h1>
      <input
        type="text"
        placeholder="상품명을 입력하세요."
        value={name}
        onChange={(e) => setName(e.target.value)}
      />
      <input
        type="number"
        placeholder="가격을 입력하세요."
        value={price}
        onChange={(e) => setPrice(e.target.value)}
      />
      <button onClick={handleSubmit} disabled={addMutation.isPending}>
        {addMutation.isPending ? "추가 중..." : "추가"}
      </button>
      <hr></hr>



      <ul>
        {products.map((product) => (
          <ProductItem
            key={product.id}
            product={product}
            onDelete={handleDelete}
            isDeletePending={deleteMutation.isPending}
          />
        ))}
        {/* 데이터가 없을 경우 안내 메시지 */}
        {products?.length === 0 && <p>등록된 상품이 없습니다.</p>}
      </ul>

      <hr />


    </div>
  );
}

export default ProductHome;