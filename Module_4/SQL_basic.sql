#2 Hiển thị thông tin của các cản phẩm có số lượng > 20 và có đơn giá < 1.000.000 VNĐ
SELECT * from sanphamdochoi a
WHERE a.soluong > 20 and a.dongia < 1000000;

SELECT * from sanphamdungcu a
WHERE a.soluong > 20 and a.dongia < 1000000;

SELECT * from sanphamsach a
WHERE a.soluong > 20 and a.dongia < 1000000;

#3. Hiển thị thông tin của những Khách hàng có độ tuổi >16 tuổi và < 30 tuổi

SELECT * FROM khachhang as a
WHERE ROUND(DATEDIFF(now() , a.NgaySinh)/365) BETWEEN 16 and 30
  AND ROUND(DATEDIFF(now() , a.NgaySinh)/365) = 40;
  
  #Hiển thị thông tin của những Khách hàng có tên bắt đầu là các ký tự ‘K’, ‘H’ hoặc ‘T’ và có độ dài tối thiểu 15 ký tự.
  
  select *from khachhang where tenkhachhang like'H%' or tenkhachhang like 'T%' or tenkhachhang like 'K%' and char_length(tenkhachhang)>=15