# Foreign Splitter

## Scenario

You went on a trip to a foreign country with your friends. The national currency in that country differs from your home 
country's currency. You paid with your credit card at a restaurant where you all ate together. You want to split the 
bill between all the participants, but the problem is that the bill is in foreign currency and the charge on your bank 
account is in your home currency. It's a simple conversion problem, but you don't know the exchange rate, and you're 
too lazy to do the math. Fortunately, you're a programmer, so you know that you should never pass an opportunity to 
spend five hours automating something that could be done manually in five minutes 😉. Therefore, you create an app that 
does the heavy lifting for you.

## The app

The app is a simple command line tool that takes the full amount in the foreign currency, the full amount in your home 
currency, calculates the exchange rate, then keeps asking for input of separate foreign amounts and returns the 
respective local amounts. The loop continues until the total sum of the entered amounts equals or exceeds the initially 
entered full foreign amount.

## The task

You are given in interface and ([main class](src/App.java)) that makes use of this interface. Your task is to implement 
the interface in a class and create an instance of that class in the main class. The rest of the flow is already 
implemented in the main class.

You have two interfaces to choose from: one that uses Double 
([ForeignSplitterDouble](src/ee/itkool/ForeignSplitterDouble.java)) and one that uses BigDecimal 
([ForeignSplitterBigDecimal](src/ee/itkool/ForeignSplitterBigDecimal.java)). If you know what BigDecimal is, it is 
better if you pick the latter. If you don't know what BigDecimal is, go with the Double option. 

***

## Сценарий

Вы отправились в путешествие за границу с друзьями. Национальная валюта в этой стране отличается от валюты вашей 
страны. Вы расплатились кредитной картой в ресторане, где ели все вместе. Вы хотите разделить счет между всеми 
участниками, но проблема в том, что счет выставлен в иностранной валюте, а оплата с вашего банковского счета 
производится в вашей национальной валюте. Это простая задача конвертации, но вы не знаете обменный курс, и вам лень 
заниматься математикой. К счастью, вы программист, поэтому знаете, что никогда не стоит упускать возможность потратить 
пять часов на автоматизацию того, что можно сделать вручную за пять минут 😉. Поэтому вы решили создаеть приложение, 
которое делает всю тяжелую работу за вас.

## Приложение

Приложение представляет собой простой инструмент командной строки, который берет полную сумму в иностранной валюте, 
полную сумму в вашей национальной валюте, рассчитывает обменный курс, затем продолжает запрашивать ввод отдельных сумм 
в иностранной валюте и возвращает соответствующие местные суммы. Цикл продолжается до тех пор, пока общая сумма 
введенных сумм не сравняется или не превысит первоначально введенную полную иностранную сумму.

## Задание

Вам дан интерфейс и ([основной класс](src/App.java)), который использует этот интерфейс. Ваша задача — реализовать 
интерфейс в классе и создать экземпляр этого класса в основном классе. Остальная часть логики уже реализована в 
основном классе.

У вас есть два интерфейса на выбор: один использует Double 
([ForeignSplitterDouble](src/ee/itkool/ForeignSplitterDouble.java)), а второй использует BigDecimal 
([ForeignSplitterBigDecimal](src/ee/itkool/ForeignSplitterBigDecimal.java)). Если вы знаете, что такое BigDecimal, 
лучше выбрать последнее. Если вы не знаете, что такое BigDecimal, используйте опцию Double.