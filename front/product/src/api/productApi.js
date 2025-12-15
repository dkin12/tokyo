import { api } from "./api";

// 상품 목록 조회
export async function fetchProducts() {
  const res = await api.get(`/api/products`);
  return res.data;
}

// 상품 추가
export async function createProduct(product) {
  const res = await api.post(`/api/products`, product);
  return res.data;
}

// 상품 삭제
export async function deleteProduct(id) {
  const res = await api.delete(`/api/products/${id}`);
  return res.data;
}