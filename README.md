# git-flow-4
* name A : mook
* name B : pim

# git flow sum
สมมติว่าเป็นสรุป
1. เริ่ม git flow ด้วยคำสั่ง
**git flow init -d**
ใส่ -d เพื่อกำหนดให้ทุก option ของชื่อ branch เป็น default

2.check branch
**git branch**

3. สร้าง feature branch
git flow featrue start <feature name>
(A)
**git flow feature start wallet**
(B)
**git flow feature start bus**

**git adog / git log --all ...** เพื่อ check

4. publish feature ไปที่ origin กรณีที่ยังพัฒนาไม่เสร็จ
**git flow feature publish <feature name>**

5. finish เพื่อ ยุบ feature เข้ากับ develop

6. 
(A)
git push origin develop
(B)
git pull origin develop
git push origin develop
(A)
git pull origin develop

7.
(B)
git flow feature start bus-use-wallet
(A)
git flow feature start edit-readme