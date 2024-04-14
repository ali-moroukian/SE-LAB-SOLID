# پیام رسان قزمیت

## گام ۱: افزودن یک روش پیام رسانی دیگر

<table dir='rtl'>
<tbody>

<tr>
<td>
<p><strong>ردیف</strong></p>
</td>
<td>
<p><strong>محل اعمال تغییرات (کلاس/واسط)</strong></p>
</td>
<td>
<p><strong>عنوان تغییر</strong></p>
</td>
<td>
<p><strong>شرحی کوتاه از تغییر</strong></p>
</td>
</tr>

<tr>
<td>
<p><strong>۱</strong></p>
</td>
<td>
<p>models</p>
</td>
<td>
<p>افزودن کلاس TelegramMessage</p>
</td>
<td>
<p>برای استفاده در سرویس ارسال پیام تلگرام که از کلاس Message ارث‌بری می‌کند.</p>
</td>
</tr>

<tr>
<td>
<p><strong>۲</strong></p>
</td>
<td>
<p>MessageService</p>
</td>
<td>
<p>اضافه شدن متود sendTelegramMessage</p>
</td>
<td>
<p>متود ارسال پیام تلگرام که به دلیل ابسترکت بودن MessageService باید به SmsMessageService و EmailMessageService نیز اضافه میشد.</p>
</td>
</tr>

<tr>
<td>
<p><strong>۳</strong></p>
</td>
<td>
<p>services</p>
</td>
<td>
<p>اضافه شدن سرویس TelegramMessageService</p>
</td>
<td>
<p>سرویسی که برای ارسال پیام تلگرام استفاده می‌شود. این سرویس از اینترفیس MessageService را پیاده‌سازی می‌کند.</p>
</td>
</tr>

<tr>
<td>
<p><strong>۴</strong></p>
</td>
<td>
<p>Main</p>
</td>
<td>
<p>اضافه شدن قابلیت ارسال پیام تلگرام</p>
</td>
<td>
<p>برای این کار کاربر باید ورودی 3 را وارد کند و سپس از او ‌آیدی مبدا و مقصد و پیام پرسیده می‌شود و message ساخته می‌شود. </p>
</td>
</tr>

<tr>
<td>
<p><strong>۵</strong></p>
</td>
<td>
<p>Main</p>
</td>
<td>
<p>ارسال پیام</p>
</td>
<td>
<p>در صورتی که پیام از جنس TelegramMessage باشد، آن را با سرویس TelegramMessageService ارسال می‌کنیم.</p>
</td>
</tr>

</tbody>
</table>

مجموع تعداد تغییرات: ۵

## گام ۲: تحلیل و وارسی برنامه از منظر تحقق و یا عدم تحقق اصول SOLID

<table dir='rtl'>
<tbody>
<tr>
<td rowspan="2">
<p>اصل 1</p>
<p>Single Responsibility</p>
</td>
<td width="95">
<p><strong>موارد تحقق</strong></p>
</td>
<td width="454">
<p>با توجه به اینکه هر کدام از کلاس‌های EmailMessageService, SmsMessageService و TelegramMessageService برای ارسال نوع خاصی از پیام پیاده‌سازی شده‌اند در نتیجه این اصل رعایت شده است.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 2</p>
<p>Open-Close Principle (OCP)</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>با توجه به اینکه برای اضافه کردن سرویس ارسال پیام تلگرام توانستیم از اینترفیس MessageService استفاده کنیم این مورد تا حدودی رعایت شده بود.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>برای اضافه کردن قابلیت جدید به کد مجبور شدیم کدهای قبلی را نیز تغییر دهیم(SmsMessageService و EmailMessageService) که نیازی به تغییر آنها نبود.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 3</p>
<p>Liskov Substitution Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>استفاده از کلاس Message و ارث‌بری آن توسط سه کلاس دیگر نشان‌دهنده‌ی برقراری این اصل است.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 4</p>
<p>Interface Segregation Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>این اصل نقض شده است زیرا به طور مثال سرویس EmailMessageService باید تابع sendTelegramMessage را پیاده‌سازی کند در حالی که به آن نیازی ندارد.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 5</p>
<p>Dependency Inversion Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>با توجه به اینکه در ارسال پیام باید به اینکه پیام از چه جنسی هست توجه میشد این اصل نقض شده است.</p>
</td>
</tr>
</tbody>
</table>

حال به بررسی راه‌حل می‌پردازیم:

<table dir='rtl'>
<tbody>
<tr>
<td width="168">
<p><strong>اصل مربوطه (از اصول </strong><strong>SOLID</strong><strong>)</strong></p>
</td>
<td width="246">
<p><strong>علت نقض</strong></p>
</td>
<td width="284">
<p><strong>راه حل پیشنهادی</strong></p>
</td>
</tr>

<tr>
<td width="168">
<p>Open-Close Principle (OCP)</p>
</td>
<td width="246">
<p>نیاز به تغییر اینترفیس برای ایجاد سرویس جدید</p>
</td>
<td width="284">
<p>به جای اینکه برای هر نوع پیام یک تابع در اینترفیس داشته باشیم تنها از یک تابع sendMessage استفاده کنیم که مسئول ارسال پیام باشد</p>
</td>
</tr>

<tr>
<td width="168">
<p>Interface Segregation Principle</p>
</td>
<td width="246">
<p>مجبور بودن به تغییر سرویس‌ها برای اضافه کردن سرویس جدید</p>
</td>
<td width="284">
<p>همان راه‌حل بالا</p>
</td>
</tr>

<tr>
<td width="168">
<p>Dependency Inversion Principle</p>
</td>
<td width="246">
<p>نیاز به بررسی نوع Messageها</p>
</td>
<td width="284">
<p>‌می‌توان متود جدید اضافه کرد تا سرویس ارسال پیام را با توجه به نوع پیام برگرداند یا سرویس ارسال پیام در Message ذخیره شود.</p>
</td>
</tr>
</tbody>
</table>
