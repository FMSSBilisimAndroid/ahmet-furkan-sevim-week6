# Week-6 Homework

## 1- Sonsuz döngü açın içinde sayaç yapın. 

```
    // Timer initilized
        var timer = 0


        // Infinity loop
        while (true){
            // Coroutine scope
            CoroutineScope(Dispatchers.IO).launch{
                val answer = doNetworkCall()
                withContext(Dispatchers.Main){
                    Log.v("PATIKA",answer)
                }
            }
            println(timer)
            timer += 1
        }
```

## 2- Döngü kilitlenmeye sebep olacak mı ?
Döngü bitene kadar main thread kilitlendi.


## 3- Kilitlenmeye sebep olmadan  aşağıdaki blok çalışır mı ?
Oluşturduğumuz sonsuz döngü ana thread' te çalıştığı için, döngüyü bitirmeden blok çalışmaz.
