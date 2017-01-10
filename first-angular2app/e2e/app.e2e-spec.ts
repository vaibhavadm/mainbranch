import { FirstAngular2appPage } from './app.po';

describe('first-angular2app App', function() {
  let page: FirstAngular2appPage;

  beforeEach(() => {
    page = new FirstAngular2appPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
