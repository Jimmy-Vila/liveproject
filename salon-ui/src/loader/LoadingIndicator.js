import { Subject } from 'rxjs';

const subject = new Subject();

export const LoadingIndicator = {
    show: () => subject.next( true),
    hide: () => subject.next(false),
    onChange: () => subject.asObservable()
};