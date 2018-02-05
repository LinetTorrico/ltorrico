
import {ModuleWithProviders, NgModule} from '@angular/core';
  import { Routes, RouterModule } from '@angular/router';

  //Componentes

  import { TiendaComponent } from './tienda/tienda.component';
  import { AnimalsComponent } from './animals/animals.component';
  import { ContactComponent } from './contact/contact.component';
  import { HomeComponent } from './home/home.component';
  import { KeepersComponent } from './keepers/keepers.component';

  const appRoutes: Routes = [ {path: '', component: HomeComponent },
      {path: '', redirectTo:'home', pathMatch: 'full' },
      {path: 'home', component: HomeComponent },
      {path: 'animals', component: AnimalsComponent },
      {path: 'contact', component: ContactComponent },
      {path: 'cuidador', component: KeepersComponent },
      {path: '**', component: HomeComponent },

  ];


@NgModule({
  imports: [RouterModule.forRoot(appRoutes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
