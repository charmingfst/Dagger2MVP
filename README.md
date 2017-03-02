# Dagger2MVP
MVP架构结合dagger2的一个不错的android小例

### MVP

![mvp](https://github.com/charmingfst/Dagger2MVP/blob/master/img/mvp.png)

View: Activities, Fragments and Widgets are all ‘Views’
Model: Data layer consists of Model objects, SQLite, API data, ContentProvider etc;
Presenter: Presenters get data from data layer and update Views. They alse respond to view events;

Note: Make your presenters and your models non-android.


