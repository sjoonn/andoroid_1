# <div align="center">Andoroid_1(코틀린)</div>

## 👋🏻 처음 화면 👋🏻
### 텍스트를 입력하는 EditText 2개와 연산자 버튼 5개, 초기화 버튼이 보인다.
<img alt="처음 화면" src="https://user-images.githubusercontent.com/102125786/184782969-5c744f13-5d28-4be0-ac52-8d888f07ba29.png">

## 📱 사용 방법 📱
### EditText 2개에 첫번째 숫자와 두번째 숫자를 입력하고 아래에 연산자 버튼을 누른다 

### + 버튼
<img alt="실행화면 + " src="https://user-images.githubusercontent.com/102125786/184783501-aba83ed7-93c7-42fb-8a79-7059c08eb7c0.png">

#### - 버튼
<img alt="실행화면 - " src="https://user-images.githubusercontent.com/102125786/184783947-be35ca4a-af60-4002-9962-8bf2024783dd.png">

#### X 버튼
<img alt="실행화면 X " src="https://user-images.githubusercontent.com/102125786/184784289-3a3ee644-154c-4a9a-a2d0-ace80246b553.png">

#### / 버튼
<img alt="실행화면 / " src="https://user-images.githubusercontent.com/102125786/184784386-2d12c24c-6867-490d-8b53-fd88b317e674.png">

#### % 버튼
<img alt="실행화면 + " src="https://user-images.githubusercontent.com/102125786/184784477-3c6693d0-7bfe-4e2c-a9e5-ef43be85ee2a.png">

#### 초기화 버튼
<img alt="초기화" src="https://user-images.githubusercontent.com/102125786/184784769-484757bf-bf47-494f-bcf1-3d23e61c84f7.png">

#### 숫자가 아닌 문자를 넣었을때
<img alt ="오류" src="https://user-images.githubusercontent.com/102125786/184785888-502cf5f7-1701-4b53-b7f8-a6d83b7b495f.png">

## ✍🏻 중요한 내용 ✍🏻

### findViewById
```kotlin
   private val et_number_1 : EditText by lazy{
        findViewById(R.id.et_number_1)
    }
```

### setOnClickListener
```kotlin
   btn_plus.setOnClickListener{
            setResultview(1)
        }
```
### 버튼 누르면 기능 구현 
```kotlin

   private fun setResultview(o: Int){
        try {
            val num1: Int = et_number_1.text.toString().toInt()
            val num2: Int = et_number_2.text.toString().toInt()
            var numResult : Int = -1
            when(o) {
                1 -> numResult = num1 + num2
                2 -> numResult = num1 - num2
                3 -> numResult = num1 * num2
                4 -> numResult = num1 / num2
                5 -> numResult = num1 % num2
            }
            tv_result.text = numResult.toString()
        } catch (e:Exception){
            Toast.makeText(
                this,"숫자 입력 오류!!",Toast.LENGTH_SHORT).show()
            }
        }

```
